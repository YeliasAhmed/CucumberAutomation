import Pages.HomePage;

public class pageObjectManager{

    public static Webdriver driver;

    public logInPage ;
    public homePage;

    public pageObjectManager(Webdriver driver){


        pageObjectManager.driver = driver;


        public logInPage getLogInPage(){

            logInPage = new LogInPage(driver)
            return logInPage;

            public HomePage getHomePage(){

                homePage = new HomePage(driver)
                return homePage;




        }





    }



}
