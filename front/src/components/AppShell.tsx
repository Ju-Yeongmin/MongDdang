import { ReactNode } from "react";

interface AppShellProps {
  header?: ReactNode;
  navbar: ReactNode;
  children: ReactNode;
}

export const AppShell = ({ header, navbar, children }: AppShellProps) => {
  return (
    <>
      <div
        style={{
          display: "flex",
          flexDirection: "column",
          boxSizing: "border-box",
          backgroundColor: "lightyellow",
          height: "100vh",
          width: "100vw",
        }}
      >
        <header>{header}</header>
        {children}
        <footer
          style={{
            alignItems: "end",
            marginTop: "auto",
          }}
        >
          {navbar}
        </footer>
      </div>
    </>
  );
};
