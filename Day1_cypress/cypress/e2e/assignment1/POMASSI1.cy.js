import { EmailPage } from "./Asssi1.js"

describe("ParaBank",()=>{
    it("Email",()=>{

        cy.fixture("emailpara").then((data)=>{

            const obj = new EmailPage()

          obj.enterurl(data.url)
          obj.click()
          obj.entername(data.name)
          obj.enteremail(data.email)
          obj.enterphone(data.phone)
          obj.entermessage(data.message)
          obj.click2()
         
        })
        
    })
})