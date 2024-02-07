Console.Write("Digite um número para gerar sua tabuada: ");
int numero = Convert.ToInt32(Console.ReadLine());

Console.WriteLine();

for (int i = 0; i <= 10; i++) {
    int resultado = numero * i;

    Console.WriteLine(numero + " X " + i + " = " + resultado);
}

Console.ReadLine();
