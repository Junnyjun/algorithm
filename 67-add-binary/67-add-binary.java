class Solution {
  public String addBinary(String a, String b) {
    StringBuilder stringBuilder = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0, sum;
    while (i >= 0 || j >= 0) {
      sum = 0;
      if (i >= 0 && a.charAt(i--) == '1') { // (1)
        sum++;
      }
      if (j >= 0 && b.charAt(j--) == '1') { // (2)
        sum++;
      }
      sum += carry; // (3)
      carry = sum >= 2 ? 1 : 0; // (4)
      stringBuilder.insert(0, sum % 2); // (5)
    }
    if (carry == 1) { // (6)
      stringBuilder.insert(0, '1');
    }
    return stringBuilder.toString();
  }
}