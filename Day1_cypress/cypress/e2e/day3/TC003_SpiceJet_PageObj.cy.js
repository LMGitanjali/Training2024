import { spicerepo } from "D:\\Cypress\\Day1_cypress\\cypress\\e2e\\day3\\SpiceJetRepository.js"

describe('Spicejet Page Object', ()=>{

    it("Login with spicejet",()=>{

        cy.fixture('data_spicejet').then((spice)=>{ 
            const obj=new spicerepo()
         obj.enterurl(spice.url)
         obj.entertitle(spice.title)
         obj.enterfname(spice.firstname)
    obj.enterlname(spice.lastname)
     obj.entercountry(spice.country)
    obj.enterdate(spice.date)
    obj.enternumber(spice.mobile_number)
 obj.enteremail(spice.email)
   obj.enterpwd1(spice.pwd1)
   obj.enterpwd2(spice.pwd2)
    obj.clicksubmit();
    })
})
})