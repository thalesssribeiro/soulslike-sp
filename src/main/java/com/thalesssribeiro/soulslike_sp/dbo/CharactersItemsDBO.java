package com.thalesssribeiro.soulslike_sp.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "characters_items")
public class CharactersItemsDBO {

    public CharactersItemsDBO(CharactersDBO charactersDBO, ItemsDBO itemsDBO, Integer quantity) {
        this.charactersDBO = charactersDBO;
        this.itemsDBO = itemsDBO;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private CharactersDBO charactersDBO;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private ItemsDBO itemsDBO;
    @Column(nullable = false)
    private Integer quantity;

}
