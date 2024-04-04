package examen1.examen1.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "directorios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Directorio {
        @Id
        @Column(name = "codigoentrada")
        private String codigoEntrada;

        private String nombre;

        private String apellido;

        private String correo;

        private String telefono;

        @OneToMany(mappedBy = "directorio", cascade = CascadeType.ALL)
        private List<Contacto> contactos;

        @OneToOne(mappedBy = "directorio", cascade = CascadeType.ALL)
        private Direccion direccion;
}
