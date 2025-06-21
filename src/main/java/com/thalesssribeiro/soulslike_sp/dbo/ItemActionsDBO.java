package com.thalesssribeiro.soulslike_sp.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "item_actions")
public class ItemActionsDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Boolean isInfinite;

    @Column(nullable = false)
    private Boolean isUsable;

    @Column(nullable = false)
    private Boolean isDrop;
    @Column(nullable = false)
    private Boolean action;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private ItemsDBO itemsDBO;

    public ItemActionsDBO(Boolean isInfinite, Boolean isUsable, Boolean isDrop, Boolean action, ItemsDBO itemsDBO) {
        this.isInfinite = isInfinite;
        this.isUsable = isUsable;
        this.isDrop = isDrop;
        this.action = action;
        this.itemsDBO = itemsDBO;
    }
}
