#include <iostream>

using namespace std;

class Pessoa{
public:
    string nome;
    void hello(){
        cout << "Hello " << nome << "\n";
    };
};

int main(){
    Pessoa pessoa;
    pessoa.nome = "Pessoa 1";
    pessoa.hello();
    exit(0);
}