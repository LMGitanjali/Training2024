/* describe("ParaBank",()=>{
    it("Using Fixture",()=>{
       // cy.fixture('para_bank').then((data)=>{
          cy.visit("https://parabank.parasoft.com/parabank/index.htm")
           cy.get('#loginPanel > :nth-child(3) > a').click()
           cy.get('#customer\\.firstName').click().type("Neha")
           cy.get('#customer\\.lastName').click().type("Dalvi")
           cy.get('#customer\\.address\\.street').click().type("Borivali,National Park")
           cy.get('#customer\\.address\\.city').click().type("Mumbai")
           cy.get('#customer\\.address\\.state').click().type("Maharashtra")
           cy.get('#customer\\.address\\.zipCode').click().type("400702")
           cy.get('#customer\\.phoneNumber').click().type("786656454")
           cy.get('#customer\\.ssn').click().type("76755")
           cy.get('#customer\\.username').click().type("dalvi@0496")
           cy.get('#customer\\.password').click().type("asdfgh")
           cy.get('#repeatedPassword').click().type("asdfgh")
           cy.get('[colspan="2"] > .button').click()
           cy.get('#leftPanel > ul > :nth-child(8) > a').click()

        })
    })
 */
//-----------------------------------------------------------------------------------------------------



 import{registerrepo} from "D:\\Cypress\\Day1_cypress\\cypress\\e2e\\assignment2\\registerpom.js"

    describe("ParaBank",()=>{
      it("Using Fixture",()=>{
         cy.fixture('registerpara').then((para)=>{

          const obj = new registerrepo()
           
          obj.enterurl(para.url)
          obj.click()
          obj.enterfname(para.firstName)
          obj.enterlname(para.lastName)
          obj.enterstreet(para.street)
          obj.entercity(para.city)
          obj.enterstate(para.state)
          obj.enterzipCode(para.zipCode)
          obj.enterpnumber(para.phoneNumber)
          obj.enterssn(para.ssn)
          obj.enteruname(para.username)
          obj.enterpwd(para.password)
          obj.enterrpwd(para.repeatedPassword)
          obj.click2()
          obj.click3()
        })
      })
    })
  