package brp

class HelloController {

    def index = {
      render 'Hejsan svejsan'
    }

    def html = {
      render {
        h1('hello grai ls')
        p('Lite html här')
        ul {
          li "ett"
          li "två"
          li "tre"
        }
      }
    }

    def xml = {
      render(contentType: 'text/xml') {
        persons {
          person(id:1) {
            name('Anders B')
            street('Gatan 1')
          }
          person(id:2) {
            name 'Jesper'
            street 'Björkdungevägen 15'
          }
        }
      }
    }

    def showParams = {
      render {
        h1('HTTP Parametrar')
        ul {
          params.each{key, value ->
            li "${key}=${value}"
          }
        }
      }
    }

    def login = {
      LoginData d ->
      if (d.hasErrors())
         redirect action:'xml'
      else {
         session.logindata = d
         redirect action:'showlogin'
      }
    }

    def showlogin = {
      render "${session.logindata.username} ${session.logindata.password}"
    }

}

class LoginData {
  String username
  String password
  static constraints = {
    username(blank:false, nullable:false)
    password(blank:false, nullable:false)
  }
}