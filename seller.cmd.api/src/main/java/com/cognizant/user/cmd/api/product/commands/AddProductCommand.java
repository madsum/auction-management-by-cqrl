package com.cognizant.user.cmd.api.product.commands;

import com.cognizant.user.core.models.Product;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class AddProductCommand {
    @TargetAggregateIdentifier
    private String id;
    @NotNull(message = "no product details were supplied")
    @Valid
    private Product product;
}
