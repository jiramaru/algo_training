Console.Write("Please enter a year :");
int year = int.Parse(Console.ReadLine()!);

if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
    Console.WriteLine("Leap");
}
else {
    Console.WriteLine("Not Leap");
}