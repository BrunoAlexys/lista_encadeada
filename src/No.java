public class No<T> {
   private T elemento;
   private No<T> proximo;


   public No(T elemento) {
      this.elemento = elemento;
      this.proximo = null;
   }

   public No(T elemento, No<T> proximo) {
      this.elemento = elemento;
      this.proximo = proximo;
   }

   public T getElemento() {
      return elemento;
   }

   public void setElemento(T elemento) {
      this.elemento = elemento;
   }

   public No getProximo() {
      return proximo;
   }

   public void setProximo(No proximo) {
      this.proximo = proximo;
   }

   @Override
   public String toString() {
      return "\nElemento: " + this.elemento + "\nProximo -> " + this.getProximo();
   }
}
