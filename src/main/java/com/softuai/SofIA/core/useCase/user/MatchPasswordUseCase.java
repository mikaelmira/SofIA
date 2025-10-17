package com.softuai.SofIA.core.useCase.user;

public interface MatchPasswordUseCase {

    boolean execute(String password, String databasePassword);

}
