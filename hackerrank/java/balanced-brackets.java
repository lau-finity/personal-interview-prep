//Stacks: Balanced Brackets (Java)
public static boolean isBalanced(String expression) {
  if (expression.length() % 2 == 1) return false;
  if (expression.length() == 0) return true;
  Stack expr = new Stack();
  for (int i = 0; i < expression.length(); i++) {
      if (expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '(') {
          expr.push(expression.charAt(i));
      } else {
          if (expr.empty()) {
              return false;
          } else {
              if ((expression.charAt(i) == '}' && expr.peek() == '{') ||
                 (expression.charAt(i) == ')' && expr.peek() == '(') ||
                 (expression.charAt(i) == ']' && expr.peek() == '[')) {
                  expr.pop();
              } else {
                  return false;
              }
          }
      }
  }
  if (expr.empty()) return true;
  else return false;
}