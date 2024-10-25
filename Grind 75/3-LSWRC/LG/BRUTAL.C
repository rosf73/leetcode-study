int max(int a, int b)
{
    if(a>=b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

int lengthOfLongestSubstring(char* s) {
    int n=strlen(s);
    int ans=0;
    int count[5001]={0};
    for(int i=0,j=0; j<n;j++)
    {
        count[s[j]]++;
        while(count[s[j]]>1)
        {
            count[s[i]]--;
            i++;
        }
        ans=max(ans,j-i+1);
    }
    return ans;
}
