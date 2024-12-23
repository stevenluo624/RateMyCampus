package app;

import javax.swing.*;

public class MainRateMyCampusApp {

    public static void main(String[] args) {
        final TempBuilder builder = new TempBuilder();
        final JFrame application = builder
                .addSignUpView()
                .addLoginView()
                .addListReviewView()
                .addCreateReviewView()
                .addProfileView()
                .addMapView()
                .addCreateReviewView()
                .addSignupUseCase()
                .addLoginUseCase()
                .addListReviewUseCase()
                .addCreateReviewUseCase()
                .addMapUseCase()
                .addProfileUseCase()
                .build();
        application.pack();
        application.setVisible(true);
    }
}