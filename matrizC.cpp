#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>

using namespace std;

void imprimirMatriz(vector<vector<int>>& M) {
    int a = M.size();
    int b = M[0].size();
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            cout << M[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    int a, b;
    cout << "numero de filas: ";
    cin >> a;
    cout << "numero de columnas: ";
    cin >> b;
    unsigned t0, t1;
    t0=clock();

    vector<vector<int>> AB(a, vector<int>(b));
    vector<vector<int>> M(a, vector<int>(b));

    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            AB[i][j] = rand() % 8; // Genera un número aleatorio entre 0 y 7
            M[i][j] = AB[i][j];
        }
    }

    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            if (i == 0 || i % 2 == 0) {
                M[i][j] += 1;
            }
            if (j == 0 || j % 2 == 0) {
                M[i][j] += 2;
            }
            if (i % 2 != 0 && j % 2 != 0) {
                M[i][j] -= 3;
            }
        }
    }

    // Se imprime la matriz AB
    cout << "Matriz AB:" << endl;
    imprimirMatriz(AB);

    // Se imprime la matriz M
    cout << "------------------------" << endl;
    cout << "Matriz M:" << endl;
    imprimirMatriz(M);
    t1 = clock();
    
    double time = (double(t1-t0)/CLOCKS_PER_SEC);
cout << "El Tiempo de ejecicion fue: " << time << endl;


    return 0;
}