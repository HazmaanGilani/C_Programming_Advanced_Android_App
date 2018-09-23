package com.cprograms.mproject.cprograms;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class FAQ extends ActionBarActivity {








    private static final String arrGroupElements[] =
            { " What are the basic data types in C?","What is the modulus operator?","What is Token in c?", "What is a nested loop?", "When is a switch statement preferable over an if statement?",
                    "What is the difference between Call by Value and Call by Reference?","What is a sequential access file?",
            "In C programming, how do you insert quote characters (' and \") into the output screen?","What are run-time errors?",
                    " Describe how arrays can be passed to a user defined function?"," What is th function of gets() function?",
                    "How can we convert strings to numbers in C?"," What is the use of a semicolon (;)? ",
            "What does the function toupper() do?", "What are enumerated types?", "What is a stack?", "What is Source Code?", "What is Object Code?",
            "What is Queue?","What are formal parameters?","What are control structures?","What are global variables and how are they declared?","What is the difference between text files and binary files?"," What is dynamic data structure?",
             "What is the advantage of a random access file?","In a switch statement, what will happen if a break statement is omitted?","Is there a built-in function in C that can be used for sorting data?","What are the advantages and disadvantages of a heap?","What are Elementary data structures ?","What is a linear data structure?","What is an abstract data type?","What is a derived data type?","What is the function of fseek() function?","What is the use of increment and decrement operators in pointers?",

            "What is the use of sizeof() operator in c?","What is spaghetti programming?","What is the function of #pragma?","What is a pointer on pointer?","What are different storage class specifiers in C?","What is Dangling pointer?","Can a program be compiled without main() function?","What is a null pointer?",
             "What is bit field?","What is a constant pointer?","What is the difference between functions abs() and fabs()?","What is a pointer to a function?","Where are local variables stored in memory?","Can global variable be an auto variable?","Can local variable be an auto variable?"
            ,"What is a full binary tree?","What is complexity of an algorithm?","What is the best case time complexity of bucket sort?","What is the time complexity of binary search?","What is the definition of  Tree in terms of graph data structure ?","If G is graph with n vertices the no of edges in the graph are? "
            ,"What is a connected graph?","What is the base address of an array?","What is an AVL Tree?"};


    private static final String arrChildElements[][] = {
            {"There are 4 basic data types in C int, char, float and Double. Int is used to declare variables that will be storing integer values. Float is used to store real numbers. Char can store individual character values.and Double is used to store long real numbers"},

            {"The modulus operator outputs the remainder of a division. It makes use of the percentage (%) symbol. For example: '8 % 2 = 0', meaning when you divide 8 by 2, the remainder is 0."},
            {"A token is either a keyword, an identifier, a constant, a string literal, or a symbol."},

            {"A nested loop is a loop that runs within another loop. Put it in another sense, you have an inner loop that is inside an outer loop. In this scenario, the inner loop is performed a number of times as specified by the outer loop. For each turn on the outer loop, the inner loop is first performed." },

            { "The switch statement is best used when dealing with selections based on a single variable or expression. However, switch statements can only evaluate integer and character data types." },
            {"When using Call by Value, you are sending the value of a variable as parameter to a function, whereas Call by Reference sends the address of the variable. Also, under Call by Value, the value in the parameter is not affected by whatever operation that takes place, while in the case of Call by Reference, values can be affected by the process within the function."},
            {"When writing programs that will store and retrieve data in a file, it is possible to designate that file into different forms. A sequential access file is such that data are saved in sequential order: one data is placed into the file after another. To access a particular data within the sequential access file, data has to be read one data at a time, until the right one is reached."},
            {"This is a common problem because quotes are normally part of a printf statement. To insert the quote character as part of the output, use the format specifiers \\' (for single quote), and \\\" (for double quote)."}
           ,{"These are errors that occur while the program is being executed. "},
            {"we cannot pass the entire array to a function. Instead, we pass to it a pointer that will point to the array first element in memory. To do this, we indicate the name of the array without the brackets"}
            ,{"The gets() function allows a full line data entry from the user. When the user presses the enter key to end the input, the entire line of characters is stored to a string variable. Note that the enter key is not included in the variable, but instead a null terminator \0 is placed after the last character"}

            ,{"C has a built-in library functions for this like atof(),atoi() and atol().atof() is used to convert to a floating point value, atoi() to convert to an integer value, and atol() to convert to a long integer value"},
            {"It is used to terminate a statement,It acts as a delimiter,so that compiler knows where each statement ends"},

            { "It is used to convert any letter to its upper case mode. Toupper() function prototype is declared in .This function will only convert a single character, and not an entire string." },

            { "Enumerated types allow the programmer to use more meaningful words as values to a variable. Each item in the enumerated type variable is actually associated with a numeric code. For example, one can create an enumerated type variable named DAYS whose values are Monday, Tuesday... Sunday " },

            { "A stack is a Linear Data Structure in which an element is inserted or deleted only at one end, called the top of the stack.It is also known as LIFO (last in, first out) Data Strucure." },

            { "Source codes are codes that were written by the programmer. It is made up of the commands and other English-like keywords that are supposed to instruct the computer what to do. In C programming, source codes are saved with the file extension .C" },

            { "computers do not understand the source code written by the programmer. Therefore, source codes are compiled using a compiler. The resulting outputs are object codes, which are in a format that can be understood by the computer processor.In C programming,object codes are saved with the file extension .OBJ"},

            { "A queue is a Linear Data strucure, where items are inserted at one end called the rear and are deleted at the other end called the front.It is also known as FIFO(First-in,first-out)" },

            {"In using functions in a C program, formal parameters contain the values that were passed by the calling function. The values are substituted in these formal parameters and used in whatever operations as indicated within the main body of the called function."},

            {"Control structures take charge at which instructions are to be performed in a program. This means that program flow may not necessarily move from one statement to the next one, but rather some alternative portions may need to be pass into or bypassed from, depending on the outcome of the conditional statements. "},

            {"Global variables are variables that can be accessed and manipulated anywhere in the program. To make a variable global, Global variables are declared outside the function,mostly on top of the main functions"},

            {"Text files contain data that can easily be understood by humans. It includes letters, numbers and other characters. While as, binary files contain '1s' and '0s' that computers can interpret"},

            {"Dynamic data structure provides a means for storing data more efficiently into memory. Using dynamic memory allocation, your program will access memory spaces as needed. This is in contrast to static data structure, wherein the programmer has to indicate a fix number of memory space to be used in the program."},

            {"If the amount of data stored in a file is fairly large, the use of random access will allow you to search through it quicker. If it had been a sequential access file, you would have to go through one record at a time until you reach the target data. A random access file lets you jump directly to the target address where data is located. "},

            {"If a break statement was not placed at the end of a particular 'Case' portion? It will move on to the next 'Case' ,causing incorrect output."},

            {"Yes, use the qsort() function. It is also possible to create user defined functions for sorting, such as those based on the balloon sort and bubble sort algorithm"},

            {"Storing data on the heap is slower than it would take when using the stack. However, the main advantage of using the heap is its flexibility. That's because memory in this structure can be allocated and remove in any particular order. Slowness in the heap can be compensated if an algorithm was well designed and implemented. "},

            {"Stack,Queue,LinkedList e.t.c are known as elementary data structures"},
            {"A data structure is said to be linear if the elements form a sequence i.e., while traversing sequentially, we can reach only one element directly from another. e.g Array, Linked list etc."},
            {"The data type which does not specify an implementation is an abstract data type."},
            {"Derived data types are those that are defined in terms of primitive data types e.g:Array,Union etc"},
            {"It is used to move the reading control to different positions."},
            {"increment  and decrement operators are used to increment, decrement a ptr used to move the ptr to next memory location."},
            {"is used to find the no of bytes occupied by a variable / data type in computer memory. e.g sizeof(int) returns 2"},
            {"Spaghetti programming refers to codes that tend to get tangled and overlapped throughout the program. This unstructured approach to coding is usually attributed to lack of experience on the part of the programmer. Spaghetti programing makes a program complex and analyzing the codes difficult, and so must be avoided as much as possible."},
            {"#pragma is used to call a function before the main function and call another function after the main function."},
            {"It is a pointer to pointer i.e it is a variable which holds the address of another pointer variable.e.g:int x ,*a=&x,**b=&a \nhere b is the pointer on pointer and x can be accessed by **b"},
            {"The different storage class specifiers in C are: auto,register,static,extern"},
            {"It is a pointer that doesn't point to a valid memory location,it arises when an object whose address is stored in a pointer is deleted or de-allocated without changing the value of the pointer"},
            {"Yes,program can be compiled without main() function but cannot be executed as execution of program starts from main()"},
            {"A pointer which points to nothing is called Null pointer"},
            {"A bit field is a member of a structure whose bit length is specified."},
            {"A pointer whose address is not allowed to be altered to hold another address after it is holding one."},
            {"These 2 functions basically perform the same action, which is to get the absolute value of the given value. Abs() is used for integer values, while fabs() is used for floating type numbers."},
            {"A pointer holding the reference of the function is called pointer to a function."},
            {"Local variable's are stored in stack memory"},
            {"No,a global variable can’t be an auto variable."},
            {"Yes,Every local variable by default is an auto variable"},
            {"A binary tree in which each node has exactly zero or two children is called a full binary tree"},
            {"It is the measure of the ammount of time/space required by an algorithm for an input of given size 'n"},
            {"O(n+k)"},
            {"O(log n)"},
            {"A connected acyclic graph is called a tree."},
            {"n-1"},
            {"A graph is said to be connected, if there exist a path between every pair of vertices"},
            {"The starting address of an array is called as the base address of the array"},
            {"It ia a height balanced binary search tree whose left amd right sub-tree differ in height at most by 1 unit"}


    };


    ExpandableListView expListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        getSupportActionBar().setElevation(4);
        expListView=(ExpandableListView)findViewById(R.id.expandableListView);


        expListView.setAdapter(new ExpandableListAdapter(this));



    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);

    }
    public class ExpandableListAdapter extends BaseExpandableListAdapter {

        private Context myContext;

        public ExpandableListAdapter(Context context) {

            myContext = context;

        }

        @Override

        public Object getChild(int groupPosition, int childPosition) {

            return null;

        }

        @Override

        public long getChildId(int groupPosition, int childPosition) {

            return 0;

        }

        @Override

        public View getChildView(int groupPosition, int childPosition,

                                 boolean isLastChild, View convertView, ViewGroup parent) {

            if (convertView == null) {

                LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                convertView = inflater.inflate(R.layout.list_item, null);

            }

            TextView Answer = (TextView) convertView.findViewById(R.id.listItem);



            Answer.setText(arrChildElements[groupPosition][childPosition]);

            return convertView;

        }

        @Override

        public int getChildrenCount(int groupPosition) {

            return arrChildElements[groupPosition].length;

        }

        @Override

        public Object getGroup(int groupPosition) {

            return null;

        }

        @Override

        public int getGroupCount() {

            return arrGroupElements.length;

        }

        @Override

        public long getGroupId(int groupPosition) {

            return 0;

        }

        @Override

        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

            if (convertView == null) {

                LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                convertView = inflater.inflate(R.layout.list_group, null);

            }

            TextView groupName = (TextView) convertView.findViewById(R.id.ListHeader);

            groupName.setText(arrGroupElements[groupPosition]);

            return convertView;

        }

        @Override

        public boolean hasStableIds() {

            return false;

        }

        @Override

        public boolean isChildSelectable(int groupPosition, int childPosition) {

            return true;}}

}
