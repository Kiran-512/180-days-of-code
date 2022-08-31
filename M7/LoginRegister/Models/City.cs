using System;
using System.Collections.Generic;
using System.Linq;
using System.ComponentModel.DataAnnotations;
using System.Web;
using System.Web.Mvc;
using System.Data.SqlClient;
using System.Data;

namespace LoginRegister.Models
{
    public class City
    {
        [Key]
        public int Id { set; get; }


        [StringLength(14,ErrorMessage ="The {0}length can not be graeter than {1}")]
        public string CityName { set; get; }

        public static List<SelectListItem> getAllCities() {

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=LoginRegister;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try {
                con.Open();

                SqlCommand selectCmnd = new SqlCommand();
                selectCmnd.Connection = con;
                selectCmnd.CommandType = CommandType.Text;
                selectCmnd.CommandText = "SELECT * FROM CITY";

                List<SelectListItem> cities = new List<SelectListItem>();
                SelectListItem Item;

                SqlDataReader dr = selectCmnd.ExecuteReader();

                while (dr.Read()) {
                    Item = new SelectListItem { Text = (string) dr[1], Value = ((int)dr[0]).ToString() };
                    cities.Add(Item);
                }

                dr.Close();
                return cities;
            }
            catch (Exception ex) {

                throw new Exception(ex.Message);
            }

            finally {
                con.Close();
            }
        }
    }
}