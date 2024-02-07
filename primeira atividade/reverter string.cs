Console.Write("Digite uma string para reverte-la: ");
string stringInput = Console.ReadLine();

char[] charVetor = stringInput.ToCharArray();
Array.Reverse(charVetor);

string stringRevertida = new string(charVetor);

Console.WriteLine("String revertida: " + stringRevertida);

Console.ReadLine();