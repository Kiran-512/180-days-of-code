using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LoginRegister.Models
{
    public class User
    {
        [Key]
        public string Username { set; get; }

        [Required(ErrorMessage ="please enter the password")]
        [DataType(DataType.Password)]
        public string Password { set; get; }

        [Required(ErrorMessage = "please confirm the password")]
        [DataType(DataType.Password)]
        [System.ComponentModel.DataAnnotations.Compare("Password", ErrorMessage = "Password do not matches")]
        public string ConfirmPassword { set; get; }

        [RegularExpression( @"^[a-zA-Z''-'\s]{1,40}")]
        public string FullName { set; get; }

        [Display(Name = "City Name")]
        [Required(ErrorMessage ="City Name can not be blank!")]
        public int CityID { set; get; }

        [EmailAddress]
        public string EmailID { set; get; }

        [Phone]
        public int Phone { set; get; }

        public IEnumerable<SelectListItem> Cities { set; get; }



        public  User GetUser(string username) {

            User user = new User();

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=LoginRegister;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try
            {
                con.Open();

                SqlCommand selectCmnd = new SqlCommand();
                selectCmnd.Connection = con;
                selectCmnd.CommandType = CommandType.Text;
                selectCmnd.CommandText = "select * from UserDetails where Username = @Username";

                selectCmnd.Parameters.AddWithValue("@Username", username);

                SqlDataReader dr = selectCmnd.ExecuteReader();

                if (dr.Read())
                {
                    user = new User { Username = (string)dr[0], Password =(string)dr[1] , CityID = (int) dr[3] , EmailID = (string) dr[4], Phone = (int) dr[5], FullName = (string) dr[2], };
                }

                return user;

            }
            catch (Exception ex)
            {
                //throw new Exception(ex.Message);
                return user;
            }
            finally
            {
                con.Close();
            }

        }

        public Boolean RegisterUser(User user)
        {
            Boolean status = false;

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=LoginRegister;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try
            {
                con.Open();

                SqlCommand insertCmnd = new SqlCommand();
                insertCmnd.Connection = con;
                insertCmnd.CommandType = CommandType.Text;
                insertCmnd.CommandText = "insert into userDetails values(@Username, @Password, @FullName,@EmailId,@CityId,@Phone)";

                insertCmnd.Parameters.AddWithValue("Username", user.Username);
                insertCmnd.Parameters.AddWithValue("Password", user.Password);
                insertCmnd.Parameters.AddWithValue("FullName", user.FullName);
                insertCmnd.Parameters.AddWithValue("CityID", user.CityID);
                insertCmnd.Parameters.AddWithValue("EmailID", user.EmailID);
                insertCmnd.Parameters.AddWithValue("Phone", user.Phone);

                insertCmnd.ExecuteNonQuery();
                status = true;
                return status;
            }
            catch (Exception ex)
            {
                //throw new Exception(ex.Message);
                return status;
            }
            finally
            {
                con.Close();
            }


        }

        internal Boolean AuthenticateUser(User user)
        {
            Boolean status = false;

            SqlConnection con = new SqlConnection();
            con.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=LoginRegister;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=False;ApplicationIntent=ReadWrite;MultiSubnetFailover=False";

            try
            {
                con.Open();

                SqlCommand selectCmnd = new SqlCommand();
                selectCmnd.Connection = con;
                selectCmnd.CommandType = CommandType.Text;
                selectCmnd.CommandText = "select count(*) from UserDetails where Username =@Username and Password = @Password";

                selectCmnd.Parameters.AddWithValue("Username", user.Username);
                selectCmnd.Parameters.AddWithValue("Password", user.Password);

                Object result  = selectCmnd.ExecuteScalar();
                
                if (result != null)
                {
                    status = true;
                }
                
                return status;

            }
            catch (Exception ex)
            {
                //throw new Exception(ex.Message);
                return status;
            }
            finally
            {
                con.Close();
            }
        }
    }
}