## CourseFinder
The CourseFinder works by comparing the character input of the user against every character of each possible option until there is a mismatch, where it moves on to the next possible option. This goes on until there is a match or the user has run out of possible options. Once the user has found a match by searching for the desired course, they see the required prerequiste coursework.

## String Pattern Matching Algorithm
CourseFinder implements a string pattern matching algorithm using a brute force algorithm. The algorithm is used to find a given pattern within a larger string.

## Algorithm
The brute force algorithm used in this program works by comparing each character in the pattern to the corresponding character in the string. If there is a mismatch, the algorithm moves on to the next character in the string and starts the comparison again. This process continues until either a match is found or the end of the string is reached.

## Inefficiency and Time Complexity
The brute force algorithm is a straightforward approach to string pattern matching, but it is also highly inefficient. In the worst case, the algorithm has a time complexity of O(mn), where m is the length of the pattern and n is the length of the string. This means that as the length of the string and pattern increases, the time it takes to find a match also increases dramatically.

## Conclusion 
While the Course Searcher is a short and concise program, it displays the full inefficiency of the brute force algorithm for the reasons mentioned above.
