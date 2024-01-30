

describe("Alerts",()=>{
    it("Show Alert",()=>{
        cy.visit("https://testpages.herokuapp.com/styled/alerts/alert-test.html")
        cy.get('#alertexamples').click()
        cy.on('window:alert',(a)=>{
            expect(a).contains('I am an alert box!')
        })
    })

    it("Show Confirm",()=>{
        cy.visit("https://testpages.herokuapp.com/styled/alerts/alert-test.html")
        cy.get('#confirmexample').click()
        cy.on('window:confirm',(b)=>{
            expect(b).contains('I am a confirm alert')
            //expect(b).contains('hello')//ERROR
        })
    })

    it("Show prompt",()=>{
        cy.visit("https://testpages.herokuapp.com/styled/alerts/alert-test.html")
        cy.window().then((c)=>{
            cy.stub(c,'prompt').returns('Gita')
        })
        cy.get('#promptexample').click()
    })
})