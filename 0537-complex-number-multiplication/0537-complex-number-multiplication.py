class Solution(object):
    def complexNumberMultiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        real1, imag1 = map(int, num1[:-1].split('+'))
        real2, imag2 = map(int, num2[:-1].split('+'))

        real_part = real1 * real2 - imag1 * imag2
        imag_part = real1 * imag2 + real2 * imag1

        return "{}+{}i".format(real_part, imag_part)

solution = Solution()
num1 = "1+1i"
num2 = "1+1i"
output = solution.complexNumberMultiply(num1, num2)
print(output)
