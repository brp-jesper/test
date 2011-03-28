package helloapp

class FibonacciService {

    static transactional = false
    static scope='session'

    def calculate(int n) {
      if (n==1) return 1;

      return calculate(n-1) + calculate(n-2)
    }

}
