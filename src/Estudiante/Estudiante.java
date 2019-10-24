package Estudiante;
public class Estudiante {
    //Atributos
    private int codigo;
    private String apellidos;
    private String especialidad;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
           
    //Metodo construcotor
    public Estudiante(int codigo,String apellidos,String especialidad,int nota1,int nota2,int nota3,int nota4){
        this.codigo=codigo;
        this.apellidos=apellidos;
        this.especialidad=especialidad;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
    }

    //metodos get
    public int getCodigo(){
        return this.codigo;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String  getEspecialidad(){
        return this.especialidad;
    }
    public int getNota1(){
        return this.nota1;
    }
    public int getNota2(){
        return this.nota2;
    }
    public int getNota3(){
        return this.nota3;
    }   
    public int getNota4(){
        return this.nota4;
    }
    //metodos set
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public void setNota1(int nota1){
        this.nota1=nota1;
    }
    public void setNota2(int nota2){
        this.nota1=nota2;
    }
    public void setNota3(int nota3){
        this.nota1=nota3;
    }
    public void setNota4(int nota4){
        this.nota1=nota4;
    }
    //Metodo para calcular promedio sin considerar la nota menor
    public double promedio(){
        int _notas[];
        _notas= new int[4];
        _notas[0]=nota1;
        _notas[1]=nota2;
        _notas[2]=nota3;
        _notas[3]=nota4;
        int sum = 0;
        for (int i=0;i<=2;i++){
            
            
            if (_notas[i]>_notas[i+1]){
                int aux= _notas[i];
                _notas[i]=_notas[i+1];
                _notas[i+1]=aux;
            }
        
        }for (int i=1;i<=3;i++){
            sum+=_notas[i];
            
        }
        return (double)sum/3;
    }
}
