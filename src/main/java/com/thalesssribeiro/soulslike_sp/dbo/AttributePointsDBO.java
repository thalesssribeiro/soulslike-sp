package com.thalesssribeiro.soulslike_sp.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attribute_points")
@NoArgsConstructor
@Getter
public class AttributePointsDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer level;
    @Column(nullable = false)
    private Integer vitality;
    @Column(nullable = false)
    private Integer endurance;
    @Column(nullable = false)
    private Integer strength;
    @Column(nullable = false)
    private Integer intelligence;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private CharactersDBO charactersDBO;

    public AttributePointsDBO(Integer level, Integer vitality, Integer endurance, Integer strength, Integer intelligence, CharactersDBO charactersDBO) {
        this.level = level;
        this.vitality = vitality;
        this.endurance = endurance;
        this.strength = strength;
        this.intelligence = intelligence;
        this.charactersDBO = charactersDBO;
    }
}
