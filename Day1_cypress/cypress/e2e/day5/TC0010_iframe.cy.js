import 'cypress-iframe'

 describe('IFRAME Test', ()=>{
    // test case
    it("Test",function(){
        // launch URL
        cy.visit("https://jqueryui.com/droppable/")
        // frame loading
        cy.frameLoaded('.demo-frame')
        //shifting focus
        cy.iframe().find("#draggable").then(function(t){
            const frmtxt = t.text()
            //assertion to verify text
            expect(frmtxt).to.contains('Drag me to my target');
            cy.log(frmtxt);
        })
        })
}) 

