#include<stdlib.h>
#include<cstring>
#include<stdio.h>
int main()
{
    int i;
    char filename[100];
    char s[100];
    m:
    for(i=0;filename[i]!='\0';i++)     filename[i]='\0';
    for(i=0;s[i]!='\0';i++)            s[i]='\0';
    scanf("%s",s);
    strcpy(filename,"javac ");
    strcat(filename,s);
    system(filename);
    printf("Íê³É\n");
    goto m;
    return 0;
}
