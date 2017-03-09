public class InvoiceTest {
    public static void main(String[] args){
        Invoice chaveEstrela = new Invoice("Chave estrela","01",49,2);
        
        System.out.printf("Description of the item:%n %s%n%s%n $%.2f%n %d%n ",chaveEstrela.getDescrip(), chaveEstrela.getNum(),chaveEstrela.getPrice(),chaveEstrela.getQuant() );
        System.out.printf("Amount to be paid: $%.2f", chaveEstrela.getInvoiceAmount());
    }
}
