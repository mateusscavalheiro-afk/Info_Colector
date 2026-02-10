package Logica_Automacao;

import java.util.Random;

@SuppressWarnings("all")

/*
  PROJETO: Coletor de dados de Automação
  OBJETIVO: Exemplificar a : - Coleta;
                             - Tratamento; e
                             - Validação de dados Indústriais.
 */

public class Main {
    public static void main(String[] args) {

        //Exibição do cabeçalho: Simula a inicialização de um sistema de informação
        System.out.println("==========================================");
        System.out.println("== Industrial Monitoring System -- V0.1 ==");
        System.out.println("==========================================");

        //Criação de um laço (loop) para repetição da coleta 5x
        //OBS: Isso é uma simulação, na vida real, isso rodaria infinitamente para monitorar a máquina

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nReading process data.. - Cicle N° " + i + ".");

            //1.Coleta de Dados
            double value_temp = read_sensor("Temperature_OVEN_01");
            System.out.println(read_sensor("test"));

            //2.Tratamento de Dados

        }
    }

    //Métodos Especiais

    public static double read_sensor(String tag) {
        Random rand = new Random();
        //Gerar de fato um número entre 10.0 - 100.00 para simular a variação de temperatura real do processo
        double read_value = 10 + (100 - 10) * rand.nextDouble();
        return read_value;
    }
}
