//Arrays: Left Rotation (Java)
public static int[] arrayLeftRotation(int[] a, int n, int k) {
  // n: number of integers
  // k: number of left rotations
  int result[] = new int[n];
  for (int i = 0; i < n; i++) {
      int num = i - k;
      if (num < 0) {
          num += n;
      }
      result[num] = a[i];
  }
  return result;
}