#include<iostream>
using namespace std;

 int minDistance(string word1, string word2) {
        int m = word1.size();
        int n = word2.size();
        int **output = new int *[m+1];
        for(int i = 0 ; i<=m ; i++){
            output[i] = new int[n+1];
        }

        //fill 1st row
        for(int j = 0; j<=n ; j++){
            output[0][j] = j;
        }

        //fill 1st col
        for(int i = 1; i<=m ; i++){
            output[i][0] = i;
        }

        //fill the remaining cells
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++){
                if(word1[m-i] == word2[n-j]){
                    output[i][j] = output[i-1][j-1];
                }
                else{
                    int x = output[i-1][j] ;
                    int y = output[i][j-1];
                    int z = output[i-1][j-1];
                    output[i][j] = 1 + min(x, min(y, z));
                }
            }
        }
        return output[m][n];
    }

        
    
int main(){

  string s,t;
  cin>>s>>t;
  cout<<minDistance(s,t)<<endl;
}