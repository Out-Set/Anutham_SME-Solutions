#include <stdio.h>
#include <stdlib.h>
#include <dirent.h> 
#include <sys/stat.h>
#include <string.h>
#define DEBUG 1
//for checking if any match found
static int count=0;
//function to walk around dir structure and find matching file and directory name
void walkDir(char *basedir,char *pattern)
{
    //Directory Pointer
    DIR *dir;
    //dirent stucture
    struct dirent *str1;
    dir = opendir(basedir);
    //if basedirectory is present
    if(dir != NULL){
        //inside loop if there is any dir or file present
        while((str1 = readdir(dir)) != NULL) {
            // do not allow "." or ".." if(strcmp(str1->d_name, ".") == 0 || strcmp(str1->d_name,
0)
{
continue;
}
//creating the full path variale for dir and files
char dirpath[] = "";
strcat(dirpath, basedir);
strcat(dirpath, "\\");
strcat(dirpath, str1->d_name);
if(isDir(dirpath)) // directory
{//pattern found


if(strstr(str1->d_name,pattern)){ printf("\nDIR found Matching: %s\n", dirpath); count++;
} // directory, walk it using recursion walkDir(dirpath,pattern);
}
else // file
{//pattern found
if(strstr(str1->d_name,pattern)){ printf("\nFILE found Matching: %s\n", dirpath); count++;
}
}
}
closedir(dir);
}
//if the base dir is not found or cannot be walked
else
{
fprintf(stderr, "\nBase Dir does not exists"); if(DEBUG)
}
perror("opendir()");
}
}
}