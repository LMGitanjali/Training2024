import {loginpage} from "D:\\Cypress\\Day1_cypress\\cypress\\e2e\\day3\\LoginRepository.js"

describe('Login', ()=>{

    it("Login",()=>{
    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    cy.fixture('data_orangehrm').then((data)=>{

        const obj = new loginpage()
    obj.enterusername(data.username);
    obj.enterpassword(data.password);
    obj.clicksubmit();

   /*  cy.get("input[name=username]").type("Admin")
    cy.get("input[name=password]").type("admin123")
    cy.get("button[type=submit").click() */
       }) 
    })
})
