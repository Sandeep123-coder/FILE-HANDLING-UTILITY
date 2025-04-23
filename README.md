# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: GANARAJU SANDEEP VARMA

*INTERN ID*: CT04WT31

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR  

*DESCRIPTION* : The program consists of three distinct classes: Readfile, Writfile, and Modifyfile, each of which demonstrates a different file operation: reading, writing, and modifying files respectively. These operations are essential for interacting with external data sources, such as text files, in a variety of real-world applications. 1. Reading a File: Readfile Class
The Readfile class illustrates how to read the contents of a file line-by-line using Java. This is one of the most common methods used for handling text files. In Java, the BufferedReader class is commonly used to read the content of a file efficiently. It wraps around a FileReader, which reads the file character by character. The combination of BufferedReader and FileReader is ideal for reading text files line-by-line, making it suitable for large files where it’s not efficient to load the entire file into memory at once.

In this class, the file to be read is specified using a path, and the BufferedReader is created using a FileReader object that points to the file location. The program uses a while loop to read each line from the file using the readLine() method. The readLine() method returns null when the end of the file is reached, which is the condition to break out of the loop. If any exception occurs (such as FileNotFoundException or IOException), the program will catch it and display a corresponding error message.

The class demonstrates efficient error handling, ensuring that the program doesn’t crash if the file is missing or if there’s an I/O issue while reading the file.

2. Writing to a File: Writfile Class
The Writfile class demonstrates how to write to a file using the FileWriter class. This class is useful when dealing with small to medium-sized text files. The FileWriter writes characters to the file one by one and is best used when the goal is to add or replace simple text data in a file.

In this example, the program defines a string of text content and writes it to a file located at a specified path. The program uses the FileWriter constructor to create a FileWriter object. The write() method is then used to write the content to the file. The try-with-resources statement (try(FileWriter writer = new FileWriter(FilePath))) ensures that the FileWriter is properly closed after writing, freeing any resources it used.

This class also includes error handling for FileNotFoundException (if the specified file path is incorrect or inaccessible) and IOException (for other input/output issues during the write operation). After successfully writing to the file, the program prints a message confirming that the file has been written.

3. Modifying a File: Modifyfile Class
The Modifyfile class showcases how to modify the contents of an existing text file. This is useful for scenarios where you need to update or replace certain data in a file without completely overwriting it.

In this class, the file’s content is first read into a list of strings using the Files.readAllLines() method. This method reads all lines of the file into a List<String>, making it easy to iterate over the content and apply changes. The program then performs a search-and-replace operation using the replaceAll() method to replace occurrences of a specific word (e.g., "Ganesh") with a new word (e.g., "Sandeep").

After modifying the content, the program writes the updated list of lines back to the same file using Files.write(). The Files.write() method efficiently overwrites the file with the new content. If an exception occurs (e.g., file not found, permission issues, etc.), the program handles the exception and displays an appropriate error message.

The Modifyfile class highlights an efficient approach for modifying large files or performing batch updates to the data. By reading all the lines into memory, the program can make targeted changes to the content and then write the modified data back to the file.

*OUTPUT* : 

![Image](https://github.com/user-attachments/assets/42f307cb-ebfa-4c80-a01a-8a76fde8f17f)

![Image](https://github.com/user-attachments/assets/b7f426b7-0931-481e-a6bf-199edccef96a)

![Image](https://github.com/user-attachments/assets/addb29dc-d25a-4db0-984e-e7affbafec7f)

