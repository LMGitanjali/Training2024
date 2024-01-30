describe('Assertions', ()=>{

    it.skip("Implicit Assertions",()=>{
    cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

/* cy.title().should("eq","OrangeHRM")
cy.url().should("eq","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
cy.url().should("include","orange")
cy.url().should("contain","orange")
//cy.url().should("include","blue")   //error */

cy.url().should("eq","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
.and("include","orange")
.and("contain","orange")

    cy.get("input[name=username]").type("Admin")
    cy.get("input[name=password]").type("admin123")
    cy.get("button[type=submit").click()
    })

    it.only("Explicit Assertions",()=>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.get("input[name=username]").type("Admin")
        cy.get("input[name=password]").type("admin123")
        cy.get("button[type=submit").click()

        let expname="admin"
        cy.get('.oxd-userdropdown-name').then((x)=>{
            let acname=x.text()
            
            //BDD-used for acceptance testing
            expect(acname).to.equal("Burak İkinci")
            expect(acname).to.not.equal(expname)

            //TDD -used for unit testing
            //assert.equal(acname,expname)//ERROR
            assert.notEqual(acname,expname)
        })
        })

})