## part 1
first of all we define the main program to run on the pom.xml file, this to ensure that it is running the main we want
(CinemaAPIApplication) and not the one we create previously.
![](imagenes/linea.PNG)  
then we modify the file with the code provided and make some modifications:  
![](imagenes/Code1.PNG)  
finally we add the bean to the application context.  
![](imagenes/Bean1.PNG)  
then we test the local host and check for the cinemas:  
![](imagenes/localhost1.PNG)  

for the second part we define a new method that work with the route cinema/{name} where {name} is the name of a cinema that may
belong to the data cinemas we specify.  
![](imagenes/MetodoName.PNG)

finally we test with an existing cinema:  
![](imagenes/cinemaWorking.PNG)  
and with a cinema that does not exist we must get the 404 error:  
![](imagenes/cinemaNotWorking.PNG)  
now we implement it with date:  
![](imagenes/dateImpl.PNG)  
and try it with correct data:  
![](imagenes/DateCorrect1.PNG)  
![](imagenes/DateCorrect2.PNG)  
and with incorrect data:  
![](imagenes/DateIncorrect2.PNG)  

and finally we do the same with the movie name:  
![](imagenes/movieImpl.PNG)  
try it with correct data:  
![](imagenes/movieCorrect.PNG)  
and with incorrect data:
![](imagenes/movieIncorrect.PNG)  

## part 2
now we set the post method:  
![](imagenes/post.PNG)  
and try to insert a new cinema function, in this case "Capitana marvel":  
![](imagenes/postConsole.PNG)  
then we check it was inserted correctly(the curl line used is on a file named functionToPost.txt):  
![](imagenes/checkPost.PNG)  
and then we check it with the url:  
![](imagenes/checkURL.PNG)  

