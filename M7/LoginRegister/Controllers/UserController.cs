using LoginRegister.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace LoginRegister.Controllers
{
    public class UserController : Controller
    {
        // GET: User
        public ActionResult Index()
        {
            return View();
        }

        // POST: User

        [HttpPost]
        public ActionResult Index(string Username)
        {
            HttpCookie cookie = Request.Cookies["CheckLogin"];
           
            if (cookie != null) {
                cookie.Expires = DateTime.Now.AddDays(-1);
                Response.Cookies.Add(cookie);
            }

            Session.Abandon();
            
            return RedirectToAction("Login");
        }

        // GET: User/Create
        public ActionResult Register()
        {

            IEnumerable<SelectListItem> cities = City.getAllCities();

            ViewBag.cities = cities;

            return View();
        }

        // POST: User/Create
        [HttpPost]
        public ActionResult Register(User user)
        {
            try
            {
                // TODO: Add insert logic here
                Boolean status =  user.RegisterUser(user);

                if (status == true)
                {
                    return RedirectToAction("Login");
                }
                else {
                    return View();
                }
            }
            catch
            {
                return View();
            }
        }


        public ActionResult Login()
        {

            HttpCookie cookie = Request.Cookies["CheckLogin"];

            if (cookie == null)
                    return View();
            else
                return RedirectToAction("Index");
        }
        
        // POST: User/Create
        [HttpPost]
        public ActionResult Login(User user)
        {
            try
            {
                // TODO: Add insert logic here
                Boolean status = user.AuthenticateUser(user);

                if (status == true)
                {

                    HttpCookie cookie = new HttpCookie("CheckLogin");
                    cookie.Expires = DateTime.Now.AddDays(1);

                    cookie.Values["UserID"] = user.Username;
                    cookie.Values["Password"] = user.Password;

                    Response.Cookies.Add(cookie);


                    User user2 = user.GetUser(user.Username);

                    Session["Username"] = user2.Username;
                    Session["FullName"] = user2.FullName;

                    return RedirectToAction("Index");
                }
                else {
                    ViewBag.Mesage = "Invalid ID Or Password";
                    return View();
                }
            }
            catch
            {
                return View();
            }
        }

        // GET: User/Edit/5
        public ActionResult Edit(string Username)
        {
            User user = new User();
            user = user.GetUser(Username);

            IEnumerable<SelectListItem> cities = City.getAllCities();

            ViewBag.cities = cities;

            return View(user);
        }

        // POST: User/Edit/5
        [HttpPost]
        public ActionResult Edit(int id, FormCollection collection)
        {
            try
            {
                // TODO: Add update logic here

                return RedirectToAction("Index");
            }
            catch
            {
                return View();
            }
        }

    }
}
