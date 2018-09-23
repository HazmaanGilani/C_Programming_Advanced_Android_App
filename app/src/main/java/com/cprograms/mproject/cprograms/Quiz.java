package com.cprograms.mproject.cprograms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quiz extends ActionBarActivity {
    int score=0;
    int qid=0;
    int i;
    int value;

    Random randomGenerator=new Random();
    int random;
    int flag=0;
    int wrong=-1;
    int correct=0;
    TextView txtQuestion,tvw,tvc;
    RadioButton rda, rdb, rdc;
    Button butNext;



    String quesions[]={"Press Next to Start",
            "The first expression in a for loop is",
            "Break statement is used for","Continue statement used for",
            "Due to variable scope in c"," total number of keywords in C are",
            "Linear search is highly inefficient compared to binary search when dealing with",
            "A double sub-scripted array declared as int a[ 3 ][ 6 ]; has how many elements? ",
            "The total number of elements that can be stored in a string without increasing its current amount of allocated memory is called its: ",
            "An algorithm that requires __________ operations to complete its task on n data elements is said to have a linear runtime. ",
            "What is the worst case Time complexity of Insertion Sort",
            "Which of the following is not a dynamic data structure?",
            "In general, linked lists allow? ",
            "Which data structure represents a waiting line and limits insertions to be made at the back of the data structure and limits removals to be made from the front"
            ,"What kind of linked list begins with a pointer to the first node, and each node contains a pointer to the next node, and the pointer in the last node points back to the first node"
            ,"How many pointers are contained as data members in the nodes of a circular, doubly linked list of integers with five nodes"
            ,"Which of the following statements about stacks is incorrect",
            "What is the worst case performance of Binary search",
            "What is the worst case performance of Linear search",
            "What is the worst case Time complexity of Bubble Sort",
            "What is the worst case Time complexity of Selection Sort",
            "What is the Average case Time complexity of Selection Sort",
            "What is the Best case Time complexity of Insertion Sort",
            "What is the best case Time complexity of Merge Sort",
            "What is the Average case Time complexity of Quick Sort",
            "What is the Best case Time complexity of Bucket Sort",
            "What is the Average case Time complexity of Radix Sort",
            "What is the worst case Space complexity of Bubble Sort",
            "What is the worst case Space complexity of Merge Sort",
            "What is the worst case Space complexity of Heap Sort",
            "Maximum no of moves to solve Tower of Hanoi puzzle is",
            "Array index in C programming starts from",
            "What is the best case Time complexity of Binary search",
            "What is the Average case performance of Linear search",
            "Which of the following algorithm design technique is used in the quick sort algorithm?",
            "Which of the following is used in traversing a given graph by breadth first search?",
            "Linked list are not suitable data structure of which one of the following problems ?",
            "The Worst case occur in linear search algorithm when?",
            "The operation of processing each element in the list is known as?",
            "Linked lists are best suited?",
            "The elements of an array are stored successively in memory cells because?",
            "The memory address of the first element of an array is called?",
            "Which of the following data structures is indexed structures?",
            "Which of the following data structure can't store the non-homogeneous data elements?",
            "The number of comparisons done by sequential search is?",
            "Which of the following is not an internal sort?",
            "In circular Queue rear is calculated by?",
            "What is the size of int variable?",
            "Program Execution in C starts from?",
            "Which of the following operator is used to compare two variables?",
            "Which of the following is the assignment operator?",
            "Which Symbol terminates a statement in C?",
            "Which of the following is the collection of different data types?",
            "The default parameter passing mechanism in C is?",
            "Which of the following operator returns the remainder of the two operands?",
            "Printf() function is the part of which header file?",
            "int main()\n" +
                    "{\n" +
                    "\tint a=8,b=2,c;\n" +
                    "\tc=a<<b;\n" +
                    "\tprintf(\"%d\",c);\n" +
                    "\treturn 0;\n" +
                    "}\n",
            "int main(){\n" +
                    "    int a=5;\n" +
                    "    switch(0)\n" +
                    "    printf(\"%d\",a);\n" +
                    "    switch(1)\n" +
                    "    printf(\"%d\",a);\n" +
                    "    return 0;\n" +
                    "}",

            "The parameter passing mechanism for an array is?",
            "int main()\n" +
                    "    {\n" +
                    "        int a = 20;\n" +
                    "        int c ;\n" +
                    "        c = a++;\n" +
                    "        printf(\"%d\", c);  \n" +
                    "        return 0;\n" +
                    "    }",

            "int main()\n" +
                    "    {\n" +
                    "        int x = 5, y = 5, z;\n" +
                    "        x = ++x; y = --y;\n" +
                    "        z = x++ + y--;\n" +
                    "        printf(\"%d\", z;)\n" +
                    "        return 0;\n" +
                    "    }",

            "What is the index number of the last element of an array with 10 elements?",

            "int main()\n" +
                    "    {\n" +
                    "        int a[5] = {'h','e','l','l','0'};\n" +
                    "        printf(\"%d\", a[1]);  \n" +
                    "        return 0;\n" +
                    "    }",


            "int main()\n" +
                    "    {\n" +
                    "        int a[5] = {'h','e','l','l','0'};\n" +
                    "        for(int i=2;i<5;i++)\n{\n"+
                    "        printf(\"%d\", a[i]);  \n}\n" +
                    "        return 0;\n" +
                    "    }",




            "int main()\n" +
                    "    {\n" +
                    "        int a=8,b=2,c;\n" +
                    "          c=a%b;              \n"+
                    "        printf(\"%d\", c);  \n" +
                    "        return 0;\n" +
                    "    }",
            "Which data structure is used to manage Printer buffer?"
            ,"Which data structure is used in evaluating mathematical expressions with parentheses?"
            ,"Which data structure is used in counter index generation?",
            "An array of n elements in C are declared as?",
            "Memory is allocated in array in?"
            ,"int a=5;\nIf variable a represent the value what does &a represent?"
            ,"The pointer that may point to a structure of same type as the structure is called?"
            ,"The '&' is ?",
            "Recursive function call uses which data structure?",
            "The time complexity for inserting an element in a stack is?",
            "The time complexity for deleting an element from a stack is?",
            "The time complexity for inserting an element in a queue of n elements is?",
            "The time complexity for deleting an element from a queue of n elements is?",
            "The non leaf nodes of a tree is also known as?",
            "The collection of more than one tree is called?",
            "A node that does not have any child nodes is called?",
            "The minimum balancing factor of an AVL tree is?",
            "The full binary tree of height h contains?",
            "Which of the following is the AND operator?",
            "Which of the following is the OR operator?",
            "Which of the following is the Not or Compliment operator?",
            "Which data structure is used in File Compression?",
            "Which data structure is used in Computer networks?",
            "The range of signed char variable is?",
            "The format specifier for short int is?",
            "The format specifier for double is?",
            "The number of children's of the node is?",
            "A full binary tree with 2n+1 nodes contain?",
            "The maximum degree of any vertex in a simple graph with n vertices is?",
            "A single character input from the keyboard can be obtained by using the function?",
            "Literal means?",
            "The balance factor for an AVL tree is either?",
            "Which of the following is the external sorting algorithm?",
            "Push and Pop operations are associated with which data structure?",
            "Which of the following data structure is used in compilers to check the balancing of parentheses?",
            "Which of the following data structure is used in multiple precision arithmetic?",
            "Which of the following data structure is used in compilers for maintainence of Symbol Table ?",
            "Which of the following data structure is used in Transportation Systems?",
            "Which of the following is the Left Shift operator?",
            "The process of putting program in a memory is called?",




    };



    String answer[]={"1","Value of the counter variable",
            "Quit the current iteration",
            "To stop the current iteration and begin the next iteration from the beginning",
            "Variables created in a function cannot be in used another function",
            "32",
            "Large, sorted arrays",
            "18"
            ,"Capacity",
            "2 n + 1",
            "O(n^2)",
            "Array",
            "Insertion and removal anywhere",
            "Queue",
            "Circular-linked list",
            "10",
            "Stacks are first-in, first-out (FIFO) data structures"
            ,"O(log n)",
            "O(n)",
            "O(n^2)",
            "O(n^2)",
            "O(n^2)",
            "O(n)",
            "O(n log n)",
            "O(n log n)",
            "O(n+k)",
            "O(nk)",
            "O(1)",
            "O(n)",
            "O(1)",
            "2^n  -1",
            "0",
            "O(1)",
            "O(n)",
            "Divide and conquer",
            "Queue",
            "Binary search",
            "Item is the last element in the array or is not there at all",
            "Traversal",
            "for the size of the structure and the data in the structure are constantly changing",
            "by this way computer can keep track only the address of the first element and the addresses of other elements can be calculated",
            "base address",
            "linear arrays"
            ,"Arrays",
            "(n+1)/2",
            "Merge Sort",
            "(rear=rear+1)%size"
            ,"2"
            ,"main() function"
            ,"=="
            ,"="
            ,"; "
            ,"Structure",
            "Call by value"
            ,"%",
            "stdio.h"
            ,"32"
            ,"No Output will be displayed"
            ,"Call by reference"
            ,"20"
            ,"10"
            ,"9"
            ,"e"
            ,"llo"
            ,"0"
            ,"Queue"
            ,"Stack"
            ,"Circular Queue"
            ,"array[n]"
            ,"Continuous way"
            ,"Address of a"
            ,"Self-Referential pointer"
            ,"at the address of operator"
            ,"Stack"
            ,"O(1)"
            ,"O(1)"
            ,"O(1)"
            ,"O(n)"
            ,"Internal nodes"
            ,"Forest"
            ,"Leaf"
            ,"-1"
            ,"2h-1 nodes"
            ,"&&"
            ,"||"
            ,"~"
            ,"Tree"
            ,"Graph"
            ,"-128 to +127"
            ,"%h"
            ,"%lf"
            ,"Degree of the node",
            "n non-leaf nodes"
            ,"n–1"
            ,"getchar ( )"
            ,"string constant"
            ,"0 , 1 or –1"
            ,"Merge Sort"
            ,"Stack"
            ,"Stack"
            ,"LinkedList"
            ,"LinkedList"
            ,"Graph"
            ,"<<"
            ,"Load"

    };



    String option[]={"","","",
            "Step value of loop","Value of the counter variable","None of options",
            "Quit a program","Quit the current iteration","Both of options",
            "To stop the current iteration and begin the next iteration from the beginning","To continue to the next line of code","To handle run time error"
            ,"Variables created in a function cannot be in used another function","Variables created in a function can be used in another function","Variables created in a function can only be used in the main function"
            ,"30","36","32",
            "Small,unsorted arrays","Large, unsorted arrays","Large, sorted arrays",
            "9","12","18"
            ,"Size","Length","Capacity",
            "n3 + 9","2 n + 1","2n",
            "O(log n)","O(n)","O(n^2)",
            "Linked list","Array","Binary Tree",
            "Insertion and removal anywhere","Insertions and removals only at one end","None of the options"
            ,"Stack","Binary tree","Queue",
            "Singly-linked list","Doubly-linked list","Circular-linked list",
            "10","12","11",
            "Stacks can be implemented using linked lists. ","The last node (at the bottom) of a stack has a null (0) link","Stacks are first-in, first-out (FIFO) data structures",
            "O(n)","O(log n)","O(n^2)","O(n)","O(n log n)","O(n^2)","O(n^2)","O(n)","O(n^3)",
            "O(n)","O(n log n)","O(n^2)",
            "O(n)","O(n log n)","O(n^2)",
            "O(n)","O(n log n)","O(n^2)",
            "O(n)","O(n log n)","O(log n)",
            "O(n log n)","O(log n)","O(n^2)",
            "O(n log n)","O(nk)","O(n+k)",
            "O(n log n)","O(nk)","O(n+k)",
            "O(n)","O(n log n)","O(1)",
            "O(n log n)","O(1)","O(n)",
            "O(log n)","O(1)","O(n^2)",
            "2^n","2^n  -1","2n-1"
            ,"1","0","-1",
            "O(n)","O(n log n)","O(1)",
            "O(n)","O(n log n)","O(1)"
            ,"Dynamic programming","Divide and conquer","Greedy method",
            "Stack","LinkedList","Queue",
            "Radix sort","Polynomial manipulation","Binary search",
            "Item is somewhere in the middle of the array","Item is the First element in the array","Item is the last element in the array or is not there at all",
            "Sorting","Merging","Traversal",
            "for relatively permanent collections of data ","for the size of the structure and the data in the structure are constantly changing","None of the options",
            "by this way computer can keep track only the address of the first element and the addresses of other elements can be calculated","the architecture of computer memory does not allow arrays to store other than serially","Both of the options",
            "Array address","first address","base address",
            "linear arrays","linked lists","Trees"
            ,"Arrays","Pointers","None of the options"
            ,"n/2","(n-1)/2","(n+1)/2"
            ,"Insertion Sort","Heap Sort","Merge Sort",
            "rear=rear+1","(rear=rear+1)%size","(rear=rear+1)/size",
            "1","2","4",
            "Header files","main() function","Variable Declaration",
            "=","==",",",
            "==",";","=",
            "; ", "." ,"}",
            "Array","String","Structure",
            "Call by value","Call by reference","None of the options",
            "/","%","^",
            "stdio.h","conio.h","string.h",
            "16","10","32",
            "5,5","Compilation Error","No Output will be displayed",
            "Call by value","Call by reference","None of the options",
            "21","22","20",
            "10","11","12",
            "10","11","9",
            "h","e","l",
            "llo","ell","ello",
            "4","2","0",
            "Tree","Stack","Queue",
            "Tree","Stack","Queue",
            "Circular Queue","Priority Queue","Stack",
            "array[n-1]","array[n]","array[n+1]",
            "Continuous way","Non-Continuous way","Random way",
            "Pointer to a","Address of a","Value of a",
            "Structure pointer","Referential pointer","Self-Referential pointer",
            "Memory allocating operator","Value assigning operator","at the address of operator",
            "LinkedList","Stack","Queue",
            "O(n)","O(n+1)","O(1)",
            "O(n+1)","O(1)","O(n)",
            "O(n)","O(n+1)","O(1)",
            "O(n)","O(n+1)","O(1)",
            "External nodes","Internal nodes","Root",
            "Complete Tree","Full Tree","Forest",
            "Leaf","Root","Sibling",
            "-1","1","0",
            "2^h nodes","2^h-1 nodes","2h-1 nodes",
            "&","&&","^",
            "~","|","||",
            "~","^","||",
            "Queue","Linked List","Tree",
            "Queue","Tree","Graph",
            "-255 to +225","0 to +255","-128 to +127",
            "%d","%s","%h",
            "%lf","%d","%f",
            "Degree of the node","Level of the node","Depth of the node",
            "n non-leaf nodes","n-1 non-leaf nodes","n leaf nodes",
            "2n–1","n+1","n–1",
            "gets ( )","getchar ( )","scanf ( )",
            "string","character","string constant",
            "0 , 1 or 2","–2 , –1 or 0","0 , 1 or –1",
            "Bubble Sort","Selection Sort","Merge Sort",
            "Stack","Queue","Array",
            "LinkedList","Queue","Stack",
            "Tree","Queue","LinkedList",
            "Tree","LinkedList","Stack",
            "Graph","Queue","LinkedList",
            "<<","^","~",
            "Compiling","Preprocessing","Load",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        getSupportActionBar().setElevation(4);



        txtQuestion = (TextView) findViewById(R.id.ques_text);


        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);

        rda = (RadioButton) findViewById(R.id.radio0);
        rdb = (RadioButton) findViewById(R.id.radio1);
        rdc = (RadioButton) findViewById(R.id.radio2);
        butNext = (Button) findViewById(R.id.restart);
        tvw = (TextView) findViewById(R.id.wh);
        tvc = (TextView) findViewById(R.id.ch);

        txtQuestion.setText(quesions[flag]);

        rda.setText(option[0]);
        rdb.setText(option[1]);
        rdc.setText(option[2]);
        tvw.setText("Rules:");
        tvc.setText("1.You will be provide with 3 options Each right option will give you one point \n \n 2.For 3 wrong answers you will loose the game\n \n3.There will be maximum of 25 question every time\n\n4.If you leave game at any point your progress will be discarded\n");

        butNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RadioButton uans = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String anstext = uans.getText().toString();
                qid++;
                if (qid == 26) {
                    Intent intent = new Intent(Quiz.this, Score.class);
                    overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
                    correct++;
                    intent.putExtra("Score", correct);
                    intent.putExtra("Wrong", wrong);

                    startActivity(intent);
                }

                if (anstext.equalsIgnoreCase(answer[flag])) {
                    correct++;
                    //Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
                    //flag=randomGenerator.nextInt(quesions.length-1)+1;
                    flag = randomNumber();


                } else {
                    wrong++;
                    //Toast.makeText(getApplicationContext(), "wrong!", Toast.LENGTH_SHORT).show();


                    //flag=randomGenerator.nextInt(quesions.length-1)+1;
                    flag = randomNumber();

                }
                if (wrong == 3) {
                    Intent intent = new Intent(Quiz.this, Score.class);
                    intent.putExtra("Score", correct);
                    intent.putExtra("Wrong", wrong);
                    overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
                    startActivity(intent);
                }
                if (flag < quesions.length) {
                    txtQuestion.setText(quesions[flag]);
                    rda.setText(option[flag * 3]);
                    rdb.setText(option[(flag * 3) + 1]);
                    rdc.setText(option[(flag * 3) + 2]);
                }
                tvw.setText("Wrong=" + wrong);
                tvc.setText("Correct=" + correct);
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    public int randomNumber(){
        ArrayList<Integer> list=new ArrayList<>();
        for (i = 1; i < quesions.length; i++) {
            list.add(new Integer(i));





        }

        Collections.shuffle(list);
        return list.get(qid);

    }















    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Quiz.this,MainActivity.class);
        //ComponentName cn=intent.getComponent();
        //Intent mainintent= IntentCompat.makeRestartActivityTask(cn);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
        startActivity(intent);
        ActivityCompat.finishAffinity(this);




    }


}
