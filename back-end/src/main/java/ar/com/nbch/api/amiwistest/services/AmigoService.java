package ar.com.nbch.api.amiwistest.services;

import ar.com.nbch.api.amiwistest.model.Amigo;

public interface AmigoService {
    Amigo addAmigo(Amigo amigo);
    boolean delAmigo(Amigo amigo);
}
