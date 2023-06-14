TDD Kata 1 - String Calculator
http://osherove.com/kata
Before you start:
■ Try not to read ahead .
■ Do one task at a time. The trick is to learn to work incrementally.
■ Make sure you only test for correct inputs. there is no need to test for invalid inputs for
this kata
■ Test First!
String Calculator
1. In a test-first manner, create a simple class class StringCalculator
   with a method public int Add(string numbers)
2. The method can take 0, 1 or 2 numbers, and will return their sum
   (for an empty string it will return 0)
   for example
   “” == 0 , “1” == 1 , “1,2” == 3
3. Start with the simplest test case of an empty string and move to one & two
   numbers
4. Remember to solve things as simply as possible so that you force yourself to
   write tests you did not think about
5. Remember to refactor after each passing test
6. Allow the Add method to handle an unknown amount of numbers
7. Allow the Add method to handle new lines between numbers (instead of commas).
8. the following input is ok: “1\n2,3” == 6
9. the following is INVALID input so do not expect it : “1,\n” (not need to write a
   test for it)
10. Support different delimiters:
    to change a delimiter, the beginning of the string will contain a separate line
    that looks like this:
    “//[delimiter]\n[numbers…]”
    for example
    “//;\n1;2” == 3
    since the default delimiter is ‘;’ .
    Note: All existing scenarios and tests should still be supported
11. Calling Add with a negative number will throw an exception “negatives not allowed” -
    and the negative that was passed.
12. If there are multiple negatives, show all of them in the exception message