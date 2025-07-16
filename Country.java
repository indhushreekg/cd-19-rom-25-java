class Country{
public static int getCountryCode(String CountryName){
int CountryCode=0;
 else if(CountryName=="India"){
CountryCode=91;
return CountryCode;
}
else if(CountryName=="australia"){
CountryCode=61;
return CountryCode;
}
else if(CountryName=="china"){
CountryCode=86;
return CountryCode;
}
else if(CountryName=="srilanka"){
CountryCode=94;
return CountryCode;
}
else if(CountryName=="aghanistan"){
CountryCode=93;
return CountryCode;
}
else if(CountryName=="canada"){
CountryCode=24;
return CountryCode;

}
else if(CountryName=="france"){
CountryCode=33;
return CountryCode;
}
else if(CountryName=="iran"){
CountryCode=98;
return CountryCode;
}


else if(CountryName=="itlay"){
CountryCode=39;
return CountryCode;
}

if(CountryName=="germany"){
CountryCode=49;
}
else if(CountryName=="indonesia"){
CountryCode=62;

}
else if(CountryName=="auntartica"){
CountryCode=672;
}

else{
	System.out.println(CountryName+" is Invalid");
	
}

return CountryCode;
}
}

