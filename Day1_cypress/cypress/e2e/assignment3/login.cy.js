/* describe("LoginPage",()=>{
    it("Login",()=>{
        cy.visit("https://parabank.parasoft.com/parabank/index.htm")
        cy.get(':nth-child(2) > .input').click().type("chinu@24")
        cy.get(':nth-child(4) > .input').click().type("abcd")
        cy.get(':nth-child(5) > .button').click()
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
    })
}) */

//-----------------------------------------------------------------------------------------------------------------
/*   describe("LoginPage",()=>{
    it("Login",()=>{

        cy.fixture('loginpara').then((para)=>{
        cy.visit(para.url)
        cy.get(':nth-child(2) > .input').click().type(para.uname)
        cy.get(':nth-child(4) > .input').click().type(para.pwd)
        cy.get(':nth-child(5) > .button').click()
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
    })
}) 
 }) 
 */



//----------------------------------------------------------------------------------------------------
 import {loginrepo} from "D:\\Cypress\\Day1_cypress\\cypress\\e2e\\assignment3\\LoginPom.js"
 
 describe("LoginPage",()=>{
     it("Login",()=>{
      cy.fixture('loginpara').then((para)=>{

        const obj = new loginrepo()

       obj.enterurl(para.url)
         obj.enterusername(para.uname)
        obj.enterpassword(para.pwd)
        obj.click()
       // obj.click1()
      })
   })
 })


