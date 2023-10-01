#include <iostream>
#include <string>
using namespace std;

int LCS( string s, string t){
  int i,j;
  int m = s.size();
  int n = t.size();
  int **output = new int*[m+1];
  for(i = 0 ; i<=m ; i++){
    output[i] = new int[n+1];
  }
  // fill 1st row
  for(j = 0; j<=n ; j++){
    output[0][j] = 0;
  }

  //fill 1st column
  for(i = 1; i<m; i++){
    output[i][j] = 0;
  }

  //fill remaining cells
  for(i = 1; i <= m; i++){
    for(j = 1; j <= n; j++){
      if(s[m-i] == t[n-j]){
        output[i][j] = output[i-1][j-1] + 1;
      }
      else{
        int a = output[i-1][j];
        int b = output[i][j-1];
        int c = output[i-1][j-1];
        output[i][j] = max(a, max(b, c));
      }
    }
  }
  return output[m][n];
}

int main(){
  string s,t;
  cin>>s>>t;
  cout<<LCS(s,t)<<endl;

}