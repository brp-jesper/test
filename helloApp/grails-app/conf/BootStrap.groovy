import helloapp.Product

class BootStrap {

    def init = { servletContext ->
        new Product(namn:'Ananas',pris:10.0,datum:new Date()).save()
        new Product(namn:'Banan',pris:50.0,datum:new Date()).save()
        new Product(namn:'Citron',pris:1.0,datum:new Date()).save()
    }
    def destroy = {
    }
}
