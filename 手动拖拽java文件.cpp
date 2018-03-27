//此程序与java文件必须在同一文件夹下 
#include<stdlib.h>
#include<cstring>
#include<stdio.h>
int main()
{
    int i,j,k=0,tag=0;
    char s[100],filename[100];
    m:    
    for(i=0;filename[i]!='\0';i++)     filename[i]='\0';
    for(i=0;s[i]!='\0';i++)            s[i]='\0';
    scanf("%s",s);
    filename[0]=s[0];
    filename[1]=s[1];
    filename[2]='\0';
    system(filename);
    j=3;
    for(i=3;s[i]!='\0';i++)
    {
               if(s[i]=='\\')
               {
                            filename[0]='c';
                            filename[1]='d';
                            filename[2]=32;
                            for(j=strlen(s)-1;j>=3;j--)
                            {
                                                     if(s[j]=='\\')
                                                     {
                                                                  tag=j;
                                                                  break;
                                                     }
                            }
                            k=j;
                            for(j=3;j<tag;j++)
                            {
                                              if(s[j]=='\\')
                                              {
                                                            filename[k]='\\';
                                                            k++;
                                              }
                                              filename[k]=s[j];
                                              k++;
                            }
                            filename[k]='\0';
                            system(filename);
                            break;
               }
    }
    for(i=0;filename[i]!='\0';i++)      filename[i]='\0';
    strcat(filename,"java ");
    for(i=j+1;s[i]!='.';i++)              filename[i+4-j]=s[i];
    filename[i+4-j]='\0';
    system(filename);
    system("pause");
    return 0;
}
