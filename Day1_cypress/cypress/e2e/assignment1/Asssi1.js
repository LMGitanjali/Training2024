export{EmailPage}

class EmailPage{

    enterurl(url){
        cy.visit(url)
    }

    click(){
        cy.get('.contact > a').click();
    }
    entername(name){
        cy.get('#name').type(name)
    }

    enteremail(email){
        cy.get('#email').type(email)
    }

    enterphone(phone){
        cy.get('#phone').type(phone)
    }

    entermessage(message){
        cy.get('#message').type(message)
    }

    click2(){
        cy.get('[colspan="2"] > .button').click()
    }
  
}

