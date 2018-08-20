/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
*/

public class LongestCommonPrefix{
  public static void main(String[] args){
    String[] strs = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(strs));
  }
  private static String longestCommonPrefix(String[] strs){
    if(strs == null || strs.length == 0)
    return "";
    String x = strs[0];
    for(int i=1;i<strs.length;i++){
      while(strs[i].indexOf(x) != 0){
        x = x.substring(0,x.length()-1);
      }
    }
    return x;
  }
}
