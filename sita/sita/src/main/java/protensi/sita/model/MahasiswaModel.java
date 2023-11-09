package protensi.sita.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id_user")
@Table(name = "Mahasiswa")
public class MahasiswaModel extends UserModel {
    @NotNull
    @Column(name = "nim", nullable = false)
    private Integer nim;

    @NotNull
    @Column(name = "tahap", nullable = false)
    private String tahap;

}