package brp

import helloapp.Product

class ProductController {

    def fibonacciService

    def index = { redirect action:'list' }

    def list = {

      [products:Product.list()]}



    def show = {
        def product = Product.read(params.id as int)
        [product: product]
    }



}
