class loginrepo{
 
    enterurl(url){
        cy.visit(url)
    }

    enterusername(uname){
        cy.get(':nth-child(2) > .input').click().type(uname)
    }

    enterpassword(pwd){
        cy.get(':nth-child(4) > .input').click().type(pwd)
    }

    click(){
        cy.get(':nth-child(5) > .button').click()
    }

    click1(){
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
    }    
}

export{loginrepo}

