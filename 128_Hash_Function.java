/**
 * Title                Hash Function
 * Problem No           128
 * URL                  http://www.lintcode.com/en/problem/hash-function/
 *
 * Original Solution    Yes
 * Other Comments       N.A.
 *
 * Author               Norman Gamage <norman.gamage@gmail.com>
 * Version              Alpha
 * Last Update          2015 Jun 27
 */

import java.math.BigInteger;

class Solution {
  /**
   * @param key:       A String you should hash
   * @param HASH_SIZE: An integer
   * @return an integer
   */
  public int hashCode(char[] key, int HASH_SIZE) {
    BigInteger a = BigInteger.valueOf(0);
    BigInteger TT = BigInteger.valueOf(33);
    BigInteger hashSize = BigInteger.valueOf(HASH_SIZE);
    BigInteger b = BigInteger.valueOf(0);
    BigInteger k = BigInteger.valueOf(0);

    for (int i = 0; i < key.length; ++i) {
      k = BigInteger.valueOf(key.length - i - 1);
      a = BigInteger.valueOf((int) key[i]);
      b = b.add(a.multiply(TT.modPow(k, hashSize)));
      b = b.mod(hashSize);
    }

    return b.mod(hashSize).intValue();
  }
}